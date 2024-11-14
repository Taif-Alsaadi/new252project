package project252;

import java.util.List;


public class ManagerSingleton {
    
    private static ManagerSingleton managerInstance;   
    private String managerName;
    private int managerId;
   
    
    
    private ManagerSingleton(int managerId, String managerName) {
        this.managerName=managerName;
        this.managerId = managerId;
           }

    public String getManagerName() {
        return "Manager Name: "+managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerId() {
        return "Manager ID: "+managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }
    
   
    public static ManagerSingleton getInstance(int managerId,  String name) {
        if (managerInstance == null) {
            managerInstance = new ManagerSingleton(managerId, name);
        }
        return managerInstance;
    }

   

 //22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222
    
    public void addService(DivingService service) {
        Service.addService(service);
    }

    public void removeService(int serviceNum) {
        Service.removeService(serviceNum);
    }

    public void showServiceInfo() {
        Service.showServiceInfo();
    }

    public void searchForService() {
        Service.searchForService();
    }
    
    public List<DivingService> getAllServices() {
        return Service.services;
    }
}


