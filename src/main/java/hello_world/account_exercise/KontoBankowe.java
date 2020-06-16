package hello_world.account_exercise;

public class KontoBankowe {
    public int balans = 10;

    public void zmiejszStanKonta(int kwota){
        balans = this.balans -kwota;
        System.out.println(balans);
    }

    public boolean czyDodatnie(){
        if(balans >= 0){
            return true;
        }else {
            return false;
        }
    }
}
