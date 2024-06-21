
package data;

import java.util.ArrayList;

public class EmployeeList extends ArrayList<Employee>{
    
    public String getNameById(int id){
        String re="NotFound";
        Employee e=null;
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getId()==id) {
                e=this.get(i);
                
            }
            if (e!=null) {
                re=e.getName();
                
            }
            
        }
        return re;
    }
    
   public Employee getEmployeeWithMaxSalary(){
       Employee em=null;
       double max=-1;
       for (int i = 0 ; i < this.size(); i++) {
           if(this.get(i).getSalary()>max){
               max=this.get(i).getSalary();
               em = this.get(i);
           }
        
           
       }
       return em;
    }
}
