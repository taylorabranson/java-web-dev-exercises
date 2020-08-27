package exercises.technology;

public class AbstractEntity {

    private static int nextComputerID = 1;
    private int Id;

    public AbstractEntity() {
        this.Id = nextComputerID;
        nextComputerID++;
    }

    public int getId() {
        return Id;
    }
}
