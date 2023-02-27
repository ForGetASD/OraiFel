package pkg0227;

import java.util.Map;


public class Aranyhal {
    private final int kivansagokszama = 3;
    private int kor;
    private String kifogta;
    private Map kivansagok;

    public Aranyhal(int kor, String kifogta) {
        this.kor = kor;
        this.kifogta = kifogta;
    }

    public Aranyhal(String kifogta) {
        this.kifogta = kifogta;
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }
    
    public int kivansagokSzama(String kifogta){
        return 0;
    }
    
    public String kikkelTalalkozott(){
        return "";
    }
    
    public boolean kivansagotTeljesit(String kivansag){
        return true;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "kivansagokszama=" + kivansagokszama + ", kor=" + kor + ", kifogta=" + kifogta + ", kivansagok=" + kivansagok + '}';
    }

    
}
