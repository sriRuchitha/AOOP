public class HardGameElementFactory extends GameElementFactory {
    @Override
    public Weapon createWeapon() {
        return new HardWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HardPowerUp();
    }
}