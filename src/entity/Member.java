package entity;

public class Member {

    private int id;
    private String name;
    private String email;

    public Member() {}

    public class Member (int id, String name, String email){
    this.id = id;
    this.name = name;
    this.email = email;

    };

    public int getId(){
        return id;
    }

    public int setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void seEmail(String email){
        this.email = email;
    };

}
