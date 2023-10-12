package Pojo;

public class JobAPIRequest {

    private String name;
    private String job;

    @Override
    public String toString() {
        return "JobAPIRequest{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
/*Request :
    {
        "name": "morpheus",
            "job": "leader"
    }*/





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
