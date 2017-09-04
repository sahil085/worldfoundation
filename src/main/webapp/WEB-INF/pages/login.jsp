<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.form/4.2.1/jquery.form.min.js"></script>
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Login Page</title>

    <!-- Bootstrap -->
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <style type="text/css">
        body{
            background-image: url(${pageContext.request.contextPath}/resources/assets/images/3.jpg);
            background-size: cover;
            color: white;
            background-repeat: no-repeat;
            background-position: center;
            background-attachment: fixed;
        }
        form{
            background: rgba(45, 45, 125, 0.58);
            color: white;
            padding: 40px;
            margin-top: 20px;

            padding-bottom: 60px;
            box-shadow: 10px 10px 5px rgba(6, 1, 1, 0.43)
        }
        h1{
            text-align: center;
        }
        .btn{
            width: 100%;
            border-radius: 0px;

        }
        .form-control{
            border-radius: 0px;
            background-color: rgba(23, 3, 3, 0.48);
            color: white;
            border-radius:1px solid #291212
        }
    </style>

    <!-- Latest compiled and minified JavaScript -->

</head>
<body>


<div class="container">
    <div class="row">
        <div class="col-sm-offset-2 col-sm-4" style="margin-left: -100px;">
            <form action="/login" method="post">
                <h1>Login Here!</h1>
                <div class="form-group">
                    <label for="Email">Email address</label>
                    <input type="email" class="form-control" name="email" placeholder="Email">
                </div>
                <div class="form-group">
                    <label for="Password">Password</label>
                    <input type="password" class="form-control" name="password" placeholder="Password">
                </div>
                <br>

                <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>
        <div class="col-sm-offset-2 col-sm-6">
            <form action="/register" method="post" enctype="multipart/form-data" id="registraionform">
                <marquee id="marquee" behavior="" direction="">Hare Krishna</marquee>
                <h1>Register Here!</h1>
                <div class="form-group">
                    <label for="firstname">First Name</label>
                    <input type="text" class="form-control" name="firstname" id="firstname" placeholder="First Name">
                </div>
                <div class="form-group">
                    <label for="lastname">Last Name</label>
                    <input type="text" class="form-control" name="lastname" id="lastname" placeholder="Last Name">
                </div>
                <div class="form-group">
                    <label for="fullname">Full Name</label>
                    <input type="text" class="form-control" name="fullname" id="fullname" placeholder="Last Name">
                </div>
                <div class="form-group">
                    <label for="Email">Email address</label>
                    <input type="email" class="form-control" name="email" id="email" placeholder="Email">
                </div>
                <div class="form-group">
                    <label for="Password">Password</label>
                    <input type="password" class="form-control" name="password" id="password" placeholder="Password">
                </div>
                <div class="form-group">
                    <label for="ContactNumber">ContactNo</label>
                    <input type="number" class="form-control" name="contactnumber" id="contactnumber" placeholder="ContactNo">
                </div>
                <div class="form-group">
                    <label for="Address">Address</label>
                    <input type="text" class="form-control" name="address" id="address" placeholder="Address">
                </div>
                <div class="form-group">
                    <label for="fileupload">Photo</label>
                    <input type="file" class="form-control" name="pic" id="fileupload" placeholder="Address">
                </div>
                <br>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>

        </div>
    </div>
</div>
<script>
    $('#registraionform').ajaxForm({

        success: function (msg) {
            alert(msg);
        },
        error: function (msg) {
            alert(msg);
        }
    });
</script>

</body>
</html>