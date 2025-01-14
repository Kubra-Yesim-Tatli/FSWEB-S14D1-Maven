package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[10];
    private MidDeveloper[] midDevelopers = new MidDeveloper[10];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[10];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources.");
        setSalary(getSalary() + 1000); // Salary update
    }

    public void addEmployee(JuniorDeveloper junior) {
        addToArray(juniorDevelopers, junior);
    }

    public void addEmployee(MidDeveloper mid) {
        addToArray(midDevelopers, mid);
    }

    public void addEmployee(SeniorDeveloper senior) {
        addToArray(seniorDevelopers, senior);
    }

    private <T> void addToArray(T[] array, T employee) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = employee;
                return;
            }
        }
        System.out.println("No available space to add employee.");
    }
}
