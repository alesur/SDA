public class Move {


    public void Left(){
        System.out.println("move Left");
    }
    public void Rigth(){
        System.out.println("move Rigth");
    }
    public void Back(){
        System.out.println("move Back");
    }

  static class Forward{
        public void jump(){
            System.out.println("jump forward");
        }
      public void jump(int a){
          System.out.println("jump forward " + a);
      }
      public void jump(String a){
          System.out.println("jump forward " + a);
      }
        public void walk(){
            System.out.println("walk forward");

        }
    }

}
