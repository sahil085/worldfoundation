package iskcongzb.services.ServiceClasses;

import iskcongzb.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service("cutomeUserDetailsService")
public class cutomeUserDetailsService implements UserDetailsService{


        @Autowired
        private UserService userService;

        @Transactional(readOnly=true)
        public UserDetails loadUserByUsername(String email)
                throws UsernameNotFoundException {
            User user = userService.findBySso(email);
            System.out.println("User : "+user);
            if(user==null){
                System.out.println("User not found");
                throw new UsernameNotFoundException("Email not found");
            }

            return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
                    user.getState().equals("Active"), true, true, true, getGrantedAuthorities(user));
        }


        private List<GrantedAuthority> getGrantedAuthorities(User user){
            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

                authorities.add(new SimpleGrantedAuthority("ROLE_"+user.getAdminType()));

            System.out.print("authorities :"+authorities);
            return authorities;
        }


    }
