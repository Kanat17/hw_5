public class Main {
    public static void main(String[] args) {
Boss boss = new Boss();
boss.setHealth(200);
boss.setDamage(150);
boss.setDefenceType("black");
        System.out.println("Здоровье: " + boss.getHealth()+
                "\nурон: "+ boss.getDamage()+"\nтип защиты: "+ boss.getDefenceType());
    }
}