class Rocket(var velocity: Double, var stage: Int, val name:String, var stages: Array<Stage>)
{
    val stageIterrator = stages.iterator()
    var currentStage: Stage =  stageIterrator.next()

    fun accelerate(){
        if(currentStage.fuelWeight > 0) {
            this.velocity += currentStage.fuelEfficiency * currentStage.fuelWeight
            currentStage.fuelWeight = 0.toDouble()
        }
        else {
            println("Out of fuel! Need to stage!")
        }

    }

    fun stage(){
        if (stageIterrator.hasNext()){
            println("Staging to stage number ${stageIterrator.next().number}")
            currentStage = stageIterrator.next()
        }
        else{
            println("Final stage reached");
        }
    }

    fun currentWeight(): Double{
        var currentWeight: Double
        stageIterrator.forEach {

        }
    }

}

