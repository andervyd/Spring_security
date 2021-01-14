<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>

<html lang="en">

    <head>

        <meta charset="UTF-8">

    </head>

    <body>

        <h3>Information for all employees</h3>

    <br/>
    <br/>
        <security:authorize access="hasRole('HR')">
            <input type="button" value="Salary" onclick="window.location.href = 'hr_info'">
            <label>Only for HR staff</label>
        </security:authorize>
    <br/>
    <br/>
        <security:authorize access="hasRole('MANAGER')">
            <input type="button" value="Performance" onclick="window.location.href = 'manager_info'">
            <label>Only for managers</label>
        </security:authorize>

    </body>

</html>