<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>Home page</title>
</head>
<body>
<h1>排行榜</h1>
<table>
    <thead>
    <tr>
        <td>排名</td>
        <td>名字</td>
        <td>分数</td>
    </tr>
    </thead>
    <tbody>
    <#list items as item>
        <tr>
            <td>${item?index+1}</td>
            <td>${item.user.name}</td>
            <td>${item.score}</td>
        </tr>
    </#list>
    </tbody>
</table>
</body>
</html>