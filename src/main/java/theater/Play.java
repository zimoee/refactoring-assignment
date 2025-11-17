package theater;

/**
 * Class representing a play.
 *
 * @author GitHub Copilot
 */
public class Play {

    private String name;
    private String type;

    /**
     * Constructs a Play.
     *
     * @param name the name of the play; must not be null
     * @param type the type of the play; must not be null
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Accessors (getters)
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    // Mutators (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}
