
import io.quarkus.mongodb.panache.common.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;

@MongoEntity(collection="people")
public class Person extends PanacheMongoEntity {
    public String name;
    public int age;
}
