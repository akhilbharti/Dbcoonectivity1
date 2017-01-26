<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "student";
// Create connection
$conn = mysqli_connect($servername, $username, $password, $dbname);
$stuname=$_POST["stuname"];
$sturollno=$_POST["sturollno"];
 $sql_query = "insert into student_info (name,rollno)
values ('$stuname','$sturollno')";

if ($conn->query($sql_query)===TRUE) {
    echo "New record created successfully";
}
 else {
    echo "Error: " . $sql_query . "<br>" . $conn->error;
}
$conn->close();
?>
