<!DOCTYPE html>
<html>
<head>

    <title> EasyShop </title>


</head>
<body>
<H1>EASY SHOP</H1><hr>
<h4>Информация о товаре</h4>
<b>Название товара: </b> ${product.title}<br>
<b>Описание товара: </b> ${product.description}<br>
<b>Цена товара: </b> ${product.price}<br>
<b>Город товара: </b> ${product.city}<br>
<b>Автор товара: </b> ${product.author}<br>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="Удалить товар"/>
</form>
</body>
</html>