import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationcells;
    private String name;

    public void setLocationcells(ArrayList<String> loc) {
        this.locationcells = loc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationcells.indexOf(userInput);
        if (index >= 0) {
            locationcells.remove(index);
            if (locationcells.isEmpty()) {
                result = "Потопил";
                System.out.println("Ой! Вы потопили " + name + " :(");
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
