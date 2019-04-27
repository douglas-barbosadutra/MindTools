export class UserLoggedDTO{
   
    jwt: string; 
    rank: number; 
    

    constructor( jwt: string, rank: number){
            this.jwt = jwt;
            this.rank = rank;
        }
}