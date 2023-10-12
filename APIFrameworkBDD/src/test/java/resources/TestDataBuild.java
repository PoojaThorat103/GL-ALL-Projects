package resources;

import pojo.AddBookRequest;

public class TestDataBuild {

    public AddBookRequest addBookPayload(){
        AddBookRequest ap1 = new AddBookRequest();
        ap1.setAisle("292ff1");
        ap1.setIsbn("bcd");
        ap1.setAuthor("Pooja Thorat");
        ap1.setName("Learn API Testing");

        return ap1;

    }
}
