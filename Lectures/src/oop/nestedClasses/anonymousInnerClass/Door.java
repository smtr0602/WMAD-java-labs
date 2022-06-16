package oop.nestedClasses.anonymousInnerClass;

public class Door {

	private Lock lock = new Lock() {
		private String key = "mydoorkey";

		@Override
		public boolean isLocked(String key) {
			if (key.equals(this.key)) {
				return false;
			}
			return true;
		}
	};

	public Lock getLock() {
		return lock;
	}
}
