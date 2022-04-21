# Productsfetcher-using-maven

## Productservices
Gives service to the users

It has [Product.java](https://github.com/Chandu71202/productsfetcher-using-maven/blob/main/productservices/src/main/java/com/eswar/product/dto/Product.java) which has the basic layout of the details of the product details and with getters and setters
`id,name,description,price`

It has [ProductDAO.java](https://github.com/Chandu71202/productsfetcher-using-maven/blob/main/productservices/src/main/java/com/eswar/product/dao/ProductDAO.java) which allows to `create,update,delete the products` and [ProductDAOimpl.java](https://github.com/Chandu71202/productsfetcher-using-maven/blob/main/productservices/src/main/java/com/eswar/product/dao/ProductDAOimpl.java) has the implementation details in it and this will import the package of `package.java`
       
It has [ProductBO.java](https://github.com/Chandu71202/productsfetcher-using-maven/blob/main/productservices/src/main/java/com/eswar/product/bo/ProductBO.java)
which will find the product using `id` provided there and [Productimpl.java](https://github.com/Chandu71202/productsfetcher-using-maven/blob/main/productservices/src/main/java/com/eswar/product/bo/ProductBOimpl.java)has the implementation details in it and this will import both the `DAO` packages

## Productweb

This has the [product.html](https://github.com/Chandu71202/productsfetcher-using-maven/blob/main/productweb/src/main/webapp/product.html) which is a webpage to get the user details

This has [CreateProductServlet.java](https://github.com/Chandu71202/productsfetcher-using-maven/blob/main/productweb/src/main/java/com/eswar/product/servelts/CreateProductServlett.java) gets the inputs from the user and creates an object of product using product class from productservices and saves it

The [DisplayProductDetailServelt.java](https://github.com/Chandu71202/productsfetcher-using-maven/blob/main/productweb/src/main/java/com/eswar/product/servelts/DisplayProductDetailsServlet.java) displays the details fetching the id from [ProductBO.java](https://github.com/Chandu71202/productsfetcher-using-maven/blob/main/productservices/src/main/java/com/eswar/product/bo/ProductBO.java) and displays it

Server used here is Tomcat Server 9.01 version

### POM.XML
It has all the dependencies of the parent and child classes and pom.xml of productservices and pom.xml of productweb must be declared with dependencies of [POM.XML](https://github.com/Chandu71202/productsfetcher-using-maven/blob/main/pom.xml) 


## SnapShots
1. Insering the details
`http://localhost:8080/productweb/product.html`

![Screenshot (229)](https://user-images.githubusercontent.com/86471473/164514672-4cc31552-a88c-4c5f-9db8-be49c9bc4968.png)

2. Confirmation
`http://localhost:8080/productweb/CreateProductServlett`

![Screenshot (230)](https://user-images.githubusercontent.com/86471473/164514804-d092b264-e68e-4146-afe2-9e90b15abfae.png)

3. Fetching Details
`http://localhost:8080/productweb/DisplayProductDetailsServlet?id=1`

![Screenshot (232)](https://user-images.githubusercontent.com/86471473/164514936-878d0e3c-2d80-4e6a-b401-2d996f191b9c.png)



