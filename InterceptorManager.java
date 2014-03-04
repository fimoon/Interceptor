
import java.util.List;
import java.util.ArrayList;


public class InterceptorManager {
    
    private List<Interceptor> interceptors = new ArrayList();
    
    public int count1 , count2;
    
    public InterceptorManager(){
        this.count1 = 0 ;
        this.count2 = 0;
        interceptors.add(new Interceptor("ajax"));
        interceptors.add(new Interceptor("cookie"));
        interceptors.add(new Interceptor("collection"));
        interceptors.add(new Interceptor("location"));
    }
    
    public void  invokeInterceptor(){
        ++ count1;
        ++ count2;
        while(count1 <= interceptors.size()){
            interceptors.get(count1 - 1).invoke(this);
        }
        if(count2 == interceptors.size() + 1)
            System.out.println("Action Executed");
        -- count2;
    }
    
}


