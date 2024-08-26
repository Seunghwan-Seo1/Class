package hw;

class Manager extends Employee {
    int bonus;

    @Override
    public int getSalary() {
        return salary + bonus;
    }
    
    public void getSalary(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
        System.out.println(salary+bonus);
        
    }
    
}
