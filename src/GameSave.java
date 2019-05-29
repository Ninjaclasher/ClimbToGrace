import javax.json.*;

import javafx.geometry.*;

/**
 * @version 1
 * @author Evan Zhang
 * Revision history:
 *  - May 21, 2019: Created ~Evan Zhang
 */
public class GameSave {
    public static JsonObject pointToJson(Point2D p) {
        return Json.createObjectBuilder()
                   .add("x", p.getX())
                   .add("y", p.getY())
                   .build();
    }

    public static Point2D jsonToPoint(JsonObject p) {
        return new Point2D(p.getJsonNumber("x").doubleValue(), p.getJsonNumber("y").doubleValue());
    }

    public JsonObject toJson() {
        return null;
    }

    public static GameSave fromJson(JsonObject data) {
        return null;
    }
}
