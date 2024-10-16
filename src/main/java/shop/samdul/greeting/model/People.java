package shop.samdul.greeting.model;

public class People {
  private int num;
  private String name;

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
}
//각각의 이름에 고유한 번호를 부여하고, 이를 스택에 쌓아 처리할 수 있게 함