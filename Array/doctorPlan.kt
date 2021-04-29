
fun main() {

    for ( i in 1..10){
        if(i%3==0 && i%5==0){
            print("DoctorPlan ");
        }else if(i%3==0){
            print("Doctor ");
        }else if(i%5==0){
            print("Plan ");
        }else{
            print("$i ");
        }

    }
}