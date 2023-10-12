package files;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;

public class ComplexJsonParse {

    public static void main (String [] args){

        // no. of cources returned by API
        JsonPath js = new JsonPath(payload.CoursePrice());

        int count = js.getInt("courses.size()");
        System.out.println(count);


        // print  purchase amount
      int totalAmount =  js.getInt("dashboard.purchaseAmount");
        System.out.println(totalAmount);

        // print title of the 1st course
       String firstCourseTitle =  js.getString("courses[0].title");
       System.out.println(firstCourseTitle);

        // Print all course title and their respective price
        for(int i=0; i<count; i++){
            String courseTitle = js.getString("courses["+i+"].title");
            System.out.println(courseTitle);
            System.out.println(js.getInt("courses["+i+"].price"));
        }

        // Print No. of copies sold by RPA Course
        for(int j=0; j<count; j++){
            String courseTitle = js.getString("courses["+j+"].title");
            if(courseTitle.equalsIgnoreCase("RPA")){
                System.out.println("This sis RPA Course Copies :  ");
                System.out.println(js.getString("courses["+j+"].copies"));
                break;
            }
        }

        // Verify if SUM of all course prices matches with purchase amount
        int sum = 0;
        int sumOfAllCourses = 0;

        for(int k=0; k<count; k++){
            int copiesOfCourse = js.getInt("courses["+k+"].copies");
            int priceOfCourse = js.getInt("courses["+k+"].price");
            int amount = copiesOfCourse * priceOfCourse ;
             sumOfAllCourses = sum + amount;

        }
         System.out.println("Addition of all courses " +sumOfAllCourses );

            int purchaseAmount = +js.getInt("dashboard.purchaseAmount");
             System.out.println("Purchase amount "+ purchaseAmount);

        Assert.assertEquals(purchaseAmount,sumOfAllCourses, " SUM of all course does not matched with purchased amount");


    }
}


//Used below json
/*

    Json used in this Section with Queries to solve
        {

        "dashboard": {

        "purchaseAmount": 910,

        "website": "rahulshettyacademy.com"

        },

        "courses": [

        {

        "title": "Selenium Python",

        "price": 50,

        "copies": 6

        },

        {

        "title": "Cypress",

        "price": 40,

        "copies": 4

        },

        {

        "title": "RPA",

        "price": 45,

        "copies": 10

        }

        ]

        }



        1. Print No of courses returned by API

        2.Print Purchase Amount

        3. Print Title of the first course

        4. Print All course titles and their respective Prices

        5. Print no of copies sold by RPA Course

        6. Verify if Sum of all Course prices matches with Purchase Amount*/
