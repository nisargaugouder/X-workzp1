<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
       <nav class="navbar navbar-expand-lg bg-body-tertiary">
             <div class="container-fluid">
               <a class="navbar-brand" href="#">Navbar</a>
               <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                 <span class="navbar-toggler-icon"></span>
               </button>
               <div class="collapse navbar-collapse" id="navbarNav">
                 <ul class="navbar-nav">
                   <li class="nav-item">
                     <a class="nav-link active" aria-current="page" href="HolidayReq.jsp">Home</a>
                   </li>
                   <li class="nav-item">
                     <a class="nav-link" href="HolidayReqRes.jsp">Result</a>
                   </li>
                 </ul>
               </div>
             </div>
         </nav>

         <form action="holiday" method="post">
             <br><br>
             <label for="name">Full Name:</label>
             <input type="text" id="name" name="name" required><br><br>

             <label for="email">Email:</label>
             <input type="email" id="email" name="email" required><br><br>

             <label for="reason">Reason for HolidayReq:</label>
             <input type="text" id="reason" name="reason" required><br><br>

             <label for="start">Start date:</label>
             <input type="date" id="start" name="start" required><br><br>

             <label for="end">End date:</label>
             <input type="date" id="end" name="end" required><br><br>

             <input type="submit" value="Apply">
         </form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>