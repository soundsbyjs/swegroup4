public class Profile {
    protected int userID = 0;
        protected int userPin = 0;
        protected String userRole = "";
        protected float userRating;
        protected float numRatings;
        protected float totalRating;
        ///variables each profile will need
        public Profile (int newID, int newPin, String newRole)
        {
            userID = newID;
            userPin = newPin;
            userRole = newRole;
            userRating = 0;
            numRatings = 0;
            totalRating = 0;
        }
        ///constructor to create a profile
        public int getID()
        {
            return userID;
        }
        ///returns the userID for the profile
        public int getPin()
        {
            return userPin;
        }
        ///returns the userPin for the profile
        public String getRole()
        {
            return userRole;
        }
        /// returns the userRole for the profile
        public float getRating()
        {
            return userRating;
        }
        public void setRating (int newRating)
        {
            totalRating = totalRating + newRating;
            numRatings++;
            userRating = totalRating / numRatings;
        }
        ///calculates the userRating for the profile
        public void setID (int newID)
        {
            userID = newID;
        }
        public void setPin (int newPin)
        {
            userPin = newPin;
        }
        public void setRole (String newRole)
        {
            userRole = newRole;
        }
}
