package bank;

public class Bank {
    private String account;
    private int balance;

    public Bank(String account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank[账号:" + account + ",余额:" + balance + "]";
    }

    //存款
    public synchronized void saveAccount() {
        //可以在不同的位置处添加sleep方法
        //获取当前的账号余额
        int balance = getBalance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //修改余额，存100
        balance += 100;
        //修改账户yue
        setBalance(balance);
        //输出存款后的账户余额
        System.out.println("存款后的账户余额为;" + balance);
    }

    public void drawAccount() {
        synchronized (this) {
            //在不同的位置添加sleep方法

            //获得当前的账户余额
            int balance = getBalance();
            //修改余额，取200
            balance = balance - 200;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //修改账户余额
            setBalance(balance);
            System.out.println("取款后的账户余额:" + balance);
        }
    }
}
