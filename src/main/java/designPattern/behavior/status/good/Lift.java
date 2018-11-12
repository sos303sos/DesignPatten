/**
 * project: designPatten
 * package: designPattern.behavior.status
 * file: Lift.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月9日 上午10:19:19
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月9日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.status.good;

/**
  * class: Lift<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月9日 上午10:19:19<BR>
  *
  */
public class Lift implements ILift {

    private int state;

    public void open() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.openWithoutLogic();
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
        }
    }

    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                break;
        }
    }

    public void run() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
        }
    }

    public void stop() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case RUNNING_STATE:
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case STOPPING_STATE:
                break;
        }
    }

    public void setState(int state) {
        this.state = state;
    }

    private void closeWithoutLogic() {
        System.out.println("电梯门关闭");
    }

    private void openWithoutLogic() {
        System.out.println("电梯门开启");
    }

    private void runWithoutLogic() {
        System.out.println("电梯门开启");
    }

    private void stopWithoutLogic() {
        System.out.println("电梯门开启");
    }
}
