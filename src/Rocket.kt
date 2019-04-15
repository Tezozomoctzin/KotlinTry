class Rocket(private var velocity: Double = 0.toDouble(), var stage: Int = 1, val name:String, var stages: ArrayList<Stage>)
{
    private val stageIterrator = stages.iterator()
    private var currentStage: Stage =  stageIterrator.next()

    fun accelerate(){
        if(currentStage.fuelWeight > 0) {
            println("Accelerating...")
            val deltaV: Double = currentStage.fuelEfficiency * currentStage.fuelWeight
            this.velocity += deltaV
            currentStage.fuelWeight = 0.toDouble()
            println("Completed. Speed Increased by $deltaV m/s")
            println("It is now $velocity m/s\n")
        }
        else {
            println("Out of fuel! Need to stage!\n")
        }

    }

    fun stage(){
        if (stageIterrator.hasNext()){
            currentStage = stageIterrator.next()
            println("Staging to stage number ${currentStage.number}...")
            //stages.removeAt(stage - 1)
            stage++
            println("Staging completed.\n")
        }
        else{
            println("Unable to take action. Final stage reached\n")
        }
    }

    fun currentWeight(): Double{
        var currentWeight: Double? = null
        stages.forEach {
            currentWeight = currentWeight!! + (it.fuelWeight+it.emptyWeight)
        }
        return currentWeight()
    }

    fun checkStage(){
        println("Checking current stage...")
        println("Current stage is number ${currentStage.number}")
        println("Stage empty weight ${currentStage.emptyWeight} kg")
        println("Stage fuel left ${currentStage.fuelWeight} kilograms")
        println("Fuel efficiency is ${currentStage.fuelEfficiency} (m/s)/kg")
        println("Check completed\n")
    }

}

