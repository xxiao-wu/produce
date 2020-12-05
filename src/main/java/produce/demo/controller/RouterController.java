package produce.demo.controller;
import  org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouterController {
    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/material.html")
    public String material(){
        return "material";
    }

    @RequestMapping("/equipment_detail")
    public String equipment_detail(){
        return "equipment_detail";
    }

    @RequestMapping("/supplies.html")
    public String supplies(){
        return "supplies";
    }

    @RequestMapping("/process.html")
    public String process(){
        return "process";
    }

    @RequestMapping("/work_information.html")
    public String work_information(){
        return "work_information";
    }

    @RequestMapping("/induction_record.html")
    public String induction_record(){
        return "induction_record";
    }

    @RequestMapping("/work_order.html")
    public String work_order(){
        return "work_order";
    }

    @RequestMapping("/material1.html")
    public String material1(){
        return "material1";
    }

    @RequestMapping("/supplies1.html")
    public String supplies1(){
        return "supplies1";
    }

    @RequestMapping("/violation.html")
    public String violation(){
        return "violation";
    }

    @RequestMapping("/remnant.html")
    public String remnant(){
        return "remnant";
    }

    @RequestMapping("/abnormal_operation.html")
    public String abnormal_operation(){
        return "abnormal_operation";
    }

    @RequestMapping("/account.html")
    public String account(){
        return "account";
    }

    @RequestMapping("/maintenance.html")
    public String maintenance(){
        return "maintenance";
    }

    @RequestMapping("/failure_escalation.html")
    public String failure_escalation(){
        return "failure_escalation";
    }

    @RequestMapping("/warranty_assigned.html")
    public String warranty_assigned(){
        return "warranty_assigned";
    }

    @RequestMapping("/equipment_repair.html")
    public String equipment_repair(){
        return "equipment_repair";
    }

    @RequestMapping("/performance_reports.html")
    public String performance_reports(){
        return "performance_reports";
    }

    @RequestMapping("/employee_details.html")
    public String employee_details(){
        return "employee_details";
    }







}
