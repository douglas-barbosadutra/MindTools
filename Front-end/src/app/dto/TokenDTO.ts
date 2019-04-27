export class TokenDTO{
   
    server: number; 
    token: string; 
    

    constructor( server: number, token: string){
            this.server = server;
            this.token = token;
        }
}