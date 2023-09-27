<!DOCTYPE html>
<html>
<head>

    <title> EasyShop </title>


</head>
<body>
<H1>EASY SHOP | <a href="/login">Войти</a> </H1><hr>
<h4>Товары со всего СНГ</h4>
<form action="/" method="get">
    Поиск по названию объявления: <input type="text" name="title"> <br>
    <input type="submit" value="Поиск...">
</form>
<#list products as product>
    <div>
        <p>
            <b>${product.title}</b> ${product.price} тенге | <a href="/product/${product.id}">Подробнее...</a>
        </p>
    </div>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post">
    Название объявления: <input type="text" name="title"/><br>
    Описание объявления: <input type="text" name="description"/><br>
    Цена объявления: <input type="number" name="price"/><br>
    Город объявления: <input type="text" name="city"/><br>
    Автор объявления: <input type="text" name="author"/><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>