package user;

import operation.*;

public class AdminUser extends User {
    public AdminUser(String name) {
        super(name);
        this.iOperations = new operation.IOperation[]{
                new ExitOperation(),
                new DisplayOperation(),
                new FindOperation(),
                new AddOperation(),
                new ChangeOperation()
        };
    }

    public int menu() {
        System.out.println("=============================");
        System.out.println("Hello 管理员 " + this.name + ", 欢迎使用人员信息管理系统!");
        System.out.println("1. 查看所有人员信息");
        System.out.println("2. 查找人员信息");
        System.out.println("3. 添加人员信息");
        System.out.println("4. 修改人员信息");
        System.out.println("0. 退出系统");
        System.out.println("=============================");
        System.out.println("请输入您的选择: ");
        return super.GetChoice();
    }
}
