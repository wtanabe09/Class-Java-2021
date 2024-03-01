class Hero {
    private String name;
    private int level;

    public Hero() {
        this.name = "名無し";
        this.level = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    //Lesson13_4
    public void setName(String name) throws NameOutOfBoundsException {
        if (name.length() < 2 || name.length() > 8) {
            throw new NameOutOfBoundsException("設定できない名前です（名前：" + name + "）" );
        } else {
            this.name = name;
        }
    }
    public void setLevel(int level) throws LevelOutOfBoundsException {
        if (level < 1 || level > 100) {
            throw new LevelOutOfBoundsException("設定できないレベルです（レベル：" + level + "）" );
        } else {
            this.level = level;
        }
    }
    
}