package team.jit.wojciechzieba.usersprovider;

class User {
    String name;
    String hobby;
    String favouriteColour;

    public User(final String name, final String hobby, final String favouriteColour) {
        this.name = name;
        this.hobby = hobby;
        this.favouriteColour = favouriteColour;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(final String hobby) {
        this.hobby = hobby;
    }

    public String getFavouriteColour() {
        return favouriteColour;
    }

    public void setFavouriteColour(final String favouriteColour) {
        this.favouriteColour = favouriteColour;
    }
}
