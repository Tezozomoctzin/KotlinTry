fun main() {

    val stages = ArrayList<Stage>()
    stages.add(Stage(1, 300, 4500.toDouble(), 0.35))
    stages.add(Stage(2, 200, 3500.toDouble(), 0.44))
    stages.add(Stage(3, 150, 2500.toDouble(), 0.23))
    stages.add(Stage(4, 100, 850.toDouble(), 0.13))
    stages.add(Stage(5, 120, 220.toDouble(), 0.22))
    stages.add(Stage(6, 80, 80.toDouble(), 0.07))

    val rocket = Rocket(0.toDouble(),1,"Kotlin", stages)


    for(i in 1..6) {
        rocket.checkStage()
        rocket.accelerate()
        rocket.stage()
    }
}