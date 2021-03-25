import {ContoDeposito} from '../gestione-cd/contoDeposito';

export class MovimentaCdDto{
  conto: ContoDeposito;
  importo: number;
  tipoMovimento: string;
}
