package activejdbc.examples.simple;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.IdGenerator;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

@Table("EMPLOYEES")
@IdName("ID")
@IdGenerator("EMPLOYEES_SEQ.nextval")
public class Employee extends Model {
    static{
        validatePresenceOf("FIRST_NAME", "LAST_NAME");
    }
}
