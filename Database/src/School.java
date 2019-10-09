import javax.persistence.OneToMany;
import java.util.Set;
import javax.persistence.Entity;

@Entity
public class School{
private SchoolType type;

public void setType(SchoolType value) {
this.type = value;
}
public SchoolType getType() {
return this.type;
}
private String name;

public void setName(String value) {
this.name = value;
}
public String getName() {
return this.name;
}
   private Set<Subject> subject;
   
   @OneToMany(mappedBy="school" )
   public Set<Subject> getSubject() {
      return this.subject;
   }
   
   public void setSubject(Set<Subject> subjects) {
      this.subject = subjects;
   }
   
   }
