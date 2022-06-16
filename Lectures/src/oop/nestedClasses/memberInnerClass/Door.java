package oop.nestedClasses.memberInnerClass;

class Door {

	private Lock lock;

	// constructor
	public Door() {
		this.lock = new Lock(true);
	}

	public Lock getLock() {
		return this.lock;
	}

	public void showDoorStatus() {
		if (this.lock.isLocked) {
			System.out.println("Door is locked");
			return;
		}
		System.out.println("Door is unlocked");
	}

	// inner class
	public class Lock {

		private boolean isLocked;

		// constructor
		public Lock(boolean isLocked) {
			this.isLocked = isLocked;
		}

		public boolean getIsLocked() {
			return this.isLocked;
		}

		public void setIsLocked(boolean isLocked) {
			this.isLocked = isLocked;
		}

	}
}
