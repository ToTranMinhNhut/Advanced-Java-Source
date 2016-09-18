/**
 * 
 */
package Product;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author minhnhutvaio
 *
 */
public class ProductMain {

    /**
     * @param args
     * @throws SQLException 
     * @throws ClassNotFoundException 
     * @throws IOException 
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("-----Please choose function----- ");
        System.out.println("1 - Add a new product.");
        System.out.println("2 - Search a product");
        System.out.println("3 - Update a product");
        System.out.println("4 - Delete a product.");

        int opt = 0;
        try {
            opt = Integer.parseInt(input.readLine());  
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        CategoryController categoryController = new CategoryController();
        ProductController productController = new ProductController();

        List<Category> listCategory = new ArrayList<Category>();
        List<Integer> idCategories = new ArrayList<>();
        List<Product>  products = new ArrayList<>();
        List<Integer> idProducts = new ArrayList<>();

        if (opt == 1) {
            listCategory = categoryController.getAllCategory();

            System.out.println("---List of Category");
            for (Category category : listCategory) {
                // set id of category to list
                idCategories.add(category.getId());

                // print list of category
                System.out.println(category.toString());
            }

            System.out.println("Please choose id category of product:");
            int idCategory = 0;

            try {
                idCategory = Integer.parseInt(input.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error is here: " + e.getMessage());
            }

            for (Integer id : idCategories) {

                if (idCategory == id) {

                    System.out.println("Please enter name: ");
                    String name = input.readLine();

                    System.out.println("Please enter price: ");
                    double price = Double.parseDouble(input.readLine());

                    System.out.println("Please enter amount: ");
                    int amount = Integer.parseInt(input.readLine());
                    Product product = new Product(name, price, amount, idCategory);

                    productController.insertProduct(product);

                    System.out.println("Product is inserted is sucess.");
                    break;
                }
            }
        } else if (opt == 2) {
            System.out.println("Please enter product that want to search");
            String nameProduct = input.readLine();

            try {
                products = productController.searchProduct(nameProduct);
                if (products.size() <=0) {
                    System.out.println("Cannot find product");
                }else {
                    for (Product product : products) {
                        System.out.println(product.toString());
                    }
                }
            } catch (SQLException | ClassCastException | HeadlessException e) {
                System.out.println();
            }

        } else if (opt == 3) {
            products = productController.getAllProducts();

            for (Product product : products) {
                // set id of products to list
                idProducts.add(product.getId());

                // print list of products
                System.out.println(product.toString());
            }

            System.out.println("Please choose product that want to update");
            int idProduct = Integer.parseInt(input.readLine());

            for (Integer id : idProducts) {
                if (idProduct == id) {
                    System.out.println("Please enter new price:");
                    double price = Double.parseDouble(input.readLine());

                    System.out.print("Please enter new amount:");
                    int amount = Integer.parseInt(input.readLine());

                    Product p = new Product();
                    p.setPrice(price);
                    p.setAmout(amount);
                    p.setId(idProduct);

                    productController.updateProduct(p);
                    System.out.println("Product is updated is sucess.");
                    break;
                }
            }

        } else if (opt == 4) {
            products = productController.getAllProducts();

            for (Product product : products) {
                // set id of products to list
                idProducts.add(product.getId());

                // print list of products
                System.out.println(product.toString());
            }

            System.out.println("Please choose product that want to delete");
            int idProduct = Integer.parseInt(input.readLine());

            for (Integer id : idProducts) {
                if (idProduct == id) {
                    productController.deleteProduct(idProduct);;
                    System.out.println("Product is deleted is sucess.");
                }

            }
        } else {
            throw new ArithmeticException("The function do not exists.");
        }
    }       
}