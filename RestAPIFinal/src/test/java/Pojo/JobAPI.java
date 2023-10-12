package Pojo;

public class JobAPI {


    private String name;

    @Override
    public String toString() {
        return "JobAPI{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", id='" + id + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }

    private String job;
    private String id;

   /* Response :
    {
        "name": "morpheus",
            "job": "leader",
            "id": "322",
            "createdAt": "2023-08-30T09:55:57.372Z"
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    private String createdAt;
}


