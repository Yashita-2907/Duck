abstract public class Duck{
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	public void setFlyBehavior(FlyBehaviour fb){
		flyBehaviour = fb;
	}
	public void setQuackBehaviour(QuackBehaviour qb)
		quackBehaviour = qb;
	}
	
	abstract void display();
	public void performFly(){

		flyBehaviour.fly();
	}
	public void perform Quack(){

		quackBehaviour.quack();
	}
}
