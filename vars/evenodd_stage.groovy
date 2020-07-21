def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
    echo "current build is even build stage"
  }
  else{
    echo "current build is odd build stage"
  }
}
