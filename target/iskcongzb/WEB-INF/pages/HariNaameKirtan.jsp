<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Registration Page</title>

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
            margin-top: 16px;
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
        #marquee{
            height: 50px;
        }
    </style>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>


</head>
<body>



<div class="container">
    <div class="row">
        <div class="col-sm-offset-2 col-sm-8">

            <form action="/bookkirtan" method="post" enctype="multipart/form-data">
                <h2 style="color: black;text-align: center;">Hari Naam Sankirtan</h2>
                <h1>Book Here!</h1>

                <div class="form-group">
                    <label for="place">Place</label>
                    <select class="form-control" name="place" id="place">
                        <option>ghaziabad</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="Date">Date</label>
                    <input type="text" class="form-control" name="Date" id="Date" placeholder="Date">
                </div>
                <div class="form-group">
                    <label for="Time">Time</label>
                    <input type="text" class="form-control" name="Time" id="Time" placeholder="Time">
                </div>
                <div class="form-group">
                    <label for="Hsadmin">Select list:</label>
                    <select class="form-control" name="Hsadmin" id="Hsadmin">
                        <option>sanatan gaur prabhu</option>
                        <option>charu govind das prabhu</option>
                    </select>
                </div>
                <br>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>
        <div class="col-sm-2">
            <h4><a href="/viewkirtanrequest">view kirtan request</a></h4>
        </div>
    </div>
</div>


</body>
</html>