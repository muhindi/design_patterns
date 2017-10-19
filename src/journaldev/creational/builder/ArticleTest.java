/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.creational.builder;

import java.util.Date;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 6, 2017 10:53:49 PM
 * 
 */
public class ArticleTest {

    public static void main(String[] args) {
        //use a builder to create a new article 
        Article article = new Article.ArticleBuilder("Common Man's Philosophy",
                "K. Muhindi", new Date()).setCategory("philosophy").build();
        //notice: In this scenario, on optional parameters, an article instance 
        //being created is only supplied a category. 
        System.out.println(article);
    }
}
