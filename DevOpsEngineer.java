class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        // DevOps Engineer's salary is base salary plus bonus
        return super.getBaseSalary() + bonus;
    }
}
