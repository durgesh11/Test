import java.util.Comparator;

public class Cricketer {  
    private String name;  
    private int battingPosition;  
    Cricketer(String cricketerName, int cBattingPosition){  
        this.name = cricketerName;  
        this.battingPosition = cBattingPosition;  
    }  
    public String getName() {  
        return name;  
    }  
    public int getBattingPosition() {  
        return battingPosition;  
    }  
    
    
    public  String toString() {
		return name+""+battingPosition;
	}
}

  class CompareCricketer implements Comparator <Cricketer> {  
    @Override  
    public int compare(Cricketer arg0, Cricketer arg1) {  
        if(arg0.getBattingPosition() > arg1.getBattingPosition())  
            return 1;  
        else if (arg0.getBattingPosition() < arg1.getBattingPosition())  
            return -1;  
        else return 0;  
    }  
} 